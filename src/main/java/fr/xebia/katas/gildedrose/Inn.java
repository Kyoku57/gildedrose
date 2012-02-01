package fr.xebia.katas.gildedrose;

import java.util.ArrayList;
import java.util.List;

public class Inn {
	private List<Item> items;

	public Inn() {
		items = new ArrayList<Item>();
		items.add(new NormalItem("+5 Dexterity Vest", 10, 20));
		items.add(new AgedBrie("Aged Brie", 2, 0));
		items.add(new NormalItem("Elixir of the Mongoose", 5, 7));
		items.add(new SulfurasItem("Sulfuras, Hand of Ragnaros", 0, 80));
		items.add(new BackstageItem("Backstage passes to a TAFKAL80ETC concert", 15, 20));
		items.add(new ConjuredItem("Conjured Mana Cake", 3, 6));
	}

	public Inn(List<Item> items) {
		this.items = items;
	}

	public List<Item> getItems() {
		return items;
	}

	public void updateQuality() {
		for (int i = 0; i < items.size(); i++) {
			if (items.get(i) instanceof SellInUpdatable)
				((SellInUpdatable) items.get(i)).updateSellIn();
			if (items.get(i) instanceof QualityUpdatable)
				((QualityUpdatable) items.get(i)).updateQuality();
		}
	}

	public static void main(String[] args) {
		System.out.println("OMGHAI!");
		new Inn().updateQuality();
	}

}
