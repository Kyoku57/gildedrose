package fr.xebia.katas.gildedrose;


public class AgedBrie extends NormalItem implements QualityUpdatable, SellInUpdatable {

	public AgedBrie(String name, int sellIn, int quality) {
		super(name, sellIn, quality);
	}

	@Override
	public void updateQuality() {
		 if (getQuality() < 50)
             setQuality(getQuality() + 1);
		 if (getSellIn()<0 && getQuality() < 50)
             setQuality(getQuality() + 1);
	}

}
