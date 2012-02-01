package fr.xebia.katas.gildedrose;

public class ConjuredItem extends NormalItem implements QualityUpdatable,
		SellInUpdatable {

	public ConjuredItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void updateQuality() {
		if (getQuality() > 0)
            setQuality(getQuality() - 2);
		if (getSellIn()<0 && getQuality() > 0)
            setQuality(getQuality() - 2);
	}

}
