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

    private double CalcWeight(List<Item> items) {
        double sumW = 0;

        for (Item i: items) {
            sumW += i.weight;
        }

        return sumW;
    }

    private double CalcPrice(List<Item> items) {
        double sumPrice = 0;

        for (Item i: items) {
            sumPrice += i.price;
        }

        return sumPrice;
    }

    private void CheckSet(List<Item> items) {
        if(bestItem == null) {
            if(CalcWeight(items) <= maxW) {
                bestItem =items;
                bestPrice = CalcPrice(items);
            }
        } else {
            if(CalcWeight(items) <= maxW && CalcPrice(items) > bestPrice) {
                bestItem = items;
                bestPrice = CalcPrice(items);
            }
        }
    }

    public void MakeAllSets(List<Item> items) {
        if(items.size() > 0) {
            CheckSet(items);
        }

        for (int i = 0; i < items.size(); i++) {
            List<Item> newSet = new ArrayList<>(items);

            newSet.remove(i);

            MakeAllSets(newSet);
        }
    }

    public List<Item> GetBestSet() {
        return bestItem;
    }
}
