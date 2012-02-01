package fr.xebia.katas.gildedrose;

public class NormalItem extends Item implements QualityUpdatable,
		SellInUpdatable {

	public NormalItem(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void updateSellIn() {
		setSellIn(getSellIn()-1);
	}

	@Override
	public void updateQuality() {
		if (getQuality() > 0)
            setQuality(getQuality() - 1);
		if (getSellIn()<0 && getQuality() > 0)
            setQuality(getQuality() - 1);
	}

}
