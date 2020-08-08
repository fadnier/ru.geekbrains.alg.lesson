package lesson5;

import java.util.ArrayList;
import java.util.List;

public class Backpack {
    private List<Item> bestItem;
    private double maxW;
    private double bestPrice;

    public Backpack(double maxW) {
        this.maxW = maxW;
    }

    private double calcWeight(List<Item> items) {
        double sumW = 0;

        for (Item i: items) {
            sumW += i.weight;
        }

        return sumW;
    }

    private double calcPrice(List<Item> items) {
        double sumPrice = 0;

        for (Item i: items) {
            sumPrice += i.price;
        }

        return sumPrice;
    }

    private void checkSet(List<Item> items) {
        if(bestItem == null) {
            if(calcWeight(items) <= maxW) {
                bestItem =items;
                bestPrice = calcPrice(items);
            }
        } else {
            if(calcWeight(items) <= maxW && calcPrice(items) > bestPrice) {
                bestItem = items;
                bestPrice = calcPrice(items);
            }
        }
    }

    public void makeAllSets(List<Item> items) {
        if(items.size() > 0) {
            checkSet(items);
        }

        for (int i = 0; i < items.size(); i++) {
            List<Item> newSet = new ArrayList<>(items);

            newSet.remove(i);

            makeAllSets(newSet);
        }
    }

    public List<Item> getBestSet() {
        return bestItem;
    }
}
