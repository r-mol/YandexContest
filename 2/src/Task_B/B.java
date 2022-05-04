package Task_B;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class B {
    static List<Building> listOfBuildings = new ArrayList<>();
    static List<Integer> listOfMinDistance = new ArrayList<>();
    static int indexOfLeftShop = -1;
    static int maxDistance;

    public static void main(String[] args){
        inputData();
        findDistanceToLeftAndRightShopsOfHouse();
        findListOfMinDistanceToShopFromEachHouse();
        findMaxDistanceOfMinDistancesToShop();
        outputResult();
    }

    public static void inputData(){
        Scanner scanner = new Scanner(System.in);
        int countOfBuildings = 10;
        while(countOfBuildings != 0){
            listOfBuildings.add(new Building(scanner.nextInt(), listOfBuildings.size()));
            countOfBuildings--;
        }
    }

    public static void findDistanceToLeftAndRightShopsOfHouse(){
        for(Building building: listOfBuildings){
            int buildingType = building.getBuildingType();

            switch(buildingType){
                case 2: fillDistanceToShopForAllHouses(building);break;
                case 1: findDistanceFromShopToHouse(building); break;
                case 0: continue;
                default: break;
            }
        }
    }

    public static void fillDistanceToShopForAllHouses(Building building){
        if(indexOfLeftShop == -1 && building.getBuildingType()== 0){
            indexOfLeftShop = building.getIndex();
        }else {
            int indexOfRightShop = building.getIndex();
            for(int i = indexOfLeftShop + 1; i < indexOfRightShop; i++){
                Building house = listOfBuildings.get(i);
                if(house.getBuildingType() == 1){
                    int distanceFromRight = indexOfRightShop - house.getIndex();
                    house.setDistanceFromRight(distanceFromRight);
                }
            }
            indexOfLeftShop = indexOfRightShop;
        }

    }

    public static void findDistanceFromShopToHouse(Building building){
        if(indexOfLeftShop != -1) {
            int distanceFromLeft = building.getIndex() - indexOfLeftShop;
            building.setDistanceFromLeft(distanceFromLeft);
        }
    }

    public static void findListOfMinDistanceToShopFromEachHouse(){
        for(Building building : listOfBuildings){
            if(building.getBuildingType() == 1){
                listOfMinDistance.add(building.getMin());
            }
        }
    }

    public static void findMaxDistanceOfMinDistancesToShop(){
        maxDistance = Collections.max(listOfMinDistance);
    }

    public static void outputResult(){
        System.out.println(maxDistance);
    }
}

class Building {
    private final int buildingType;
    private int distanceFromLeft = -1;
    private int distanceFromRight = -1;
    private final int index;

    public Building(int buildingType, int index){
        this.buildingType = buildingType;
        this.index = index;
    }

    public int getBuildingType() {
        return buildingType;
    }

    public void setDistanceFromLeft(int distanceFromLeft) {
        this.distanceFromLeft = distanceFromLeft;
    }

    public void setDistanceFromRight(int distanceFromRight) {
        this.distanceFromRight = distanceFromRight;
    }

    public int getIndex() {
        return index;
    }

    public int getMin(){
        if(distanceFromLeft == -1 || distanceFromRight ==-1){
            return Math.max(distanceFromLeft,distanceFromRight);
        }else {
            return Math.min(distanceFromLeft, distanceFromRight);
        }
    }
}
