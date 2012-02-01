package fr.xebia.katas.gildedrose;

public class BackstageItem extends NormalItem implements QualityUpdatable, SellInUpdatable {

	public BackstageItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void updateQuality() {
		if (getQuality() < 50)
			setQuality(getQuality() + 1);

		if (getSellIn() < 11 && getQuality() < 50)
			setQuality(getQuality() + 1);

		if (getSellIn() < 5 && getQuality() < 50)
			setQuality(getQuality() + 1);

		if (getSellIn() < 0)
			setQuality(0);
	}

}
