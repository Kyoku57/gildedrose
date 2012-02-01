package fr.xebia.katas.gildedrose;

import java.util.LinkedList;
import java.util.List;

import org.junit.Test;

import static org.fest.assertions.Assertions.assertThat;

public class InnTest {

	@Test
	public void testUpdateAgedBrie() {
		List<Item> items = new LinkedList<Item>();
		int initialSellin=10;
		int initialQuality=20;
		items.add(new AgedBrie("Aged Brie", initialSellin, initialQuality));
		Inn inn=new Inn(items);
		inn.updateQuality();
		AgedBrie result=(AgedBrie) inn.getItems().get(0);
		assertThat(result.getSellIn()).isEqualTo(new Integer(initialSellin-1));
		assertThat(result.getQuality()).isEqualTo(initialQuality+1);
		
		items.clear();
		initialQuality=50;
		items.add(new AgedBrie("Aged Brie", initialSellin, initialQuality));
		inn=new Inn(items);
		inn.updateQuality();
		result=(AgedBrie)inn.getItems().get(0);
		assertThat(result.getQuality()).isEqualTo(initialQuality);

		items.clear();
		initialQuality=20;
		initialSellin=-1;
		items.add(new AgedBrie("Aged Brie", initialSellin, initialQuality));
		inn=new Inn(items);
		inn.updateQuality();
		result=(AgedBrie)inn.getItems().get(0);
		assertThat(result.getQuality()).isEqualTo(initialQuality+2);
	}
	
	@Test
	public void testUpdateNormalItem() {
		List<Item> items = new LinkedList<Item>();
		int initialSellin=10;
		int initialQuality=20;
		items.add(new NormalItem("I'm normal !", initialSellin, initialQuality));
		Inn inn=new Inn(items);
		inn.updateQuality();
		NormalItem result=(NormalItem) inn.getItems().get(0);
		assertThat(result.getSellIn()).isEqualTo(new Integer(initialSellin-1));
		assertThat(result.getQuality()).isEqualTo(initialQuality-1);
		
		items.clear();
		initialQuality=0;
		items.add(new NormalItem("Normal", initialSellin, initialQuality));
		inn=new Inn(items);
		inn.updateQuality();
		result=(NormalItem)inn.getItems().get(0);
		assertThat(result.getQuality()).isEqualTo(initialQuality);

		items.clear();
		initialQuality=20;
		initialSellin=-1;
		items.add(new NormalItem("Normal", initialSellin, initialQuality));
		inn=new Inn(items);
		inn.updateQuality();
		result=(NormalItem)inn.getItems().get(0);
		assertThat(result.getQuality()).isEqualTo(initialQuality-2);
	}
	
	@Test
	public void testUpdateSulfurasItem() {
		List<Item> items = new LinkedList<Item>();
		int initialSellin=10;
		int initialQuality=20;
		items.add(new SulfurasItem("Sulfuras", initialSellin, initialQuality));
		Inn inn=new Inn(items);
		inn.updateQuality();
		SulfurasItem result=(SulfurasItem) inn.getItems().get(0);
		assertThat(result.getSellIn()).isEqualTo(new Integer(initialSellin));
		assertThat(result.getQuality()).isEqualTo(initialQuality);
		
	}
	
	
	@Test
	public void testUpdateBackstageItem() {
		List<Item> items = new LinkedList<Item>();
		int initialSellin=20;
		int initialQuality=20;
		items.add(new BackstageItem("Backstage", initialSellin, initialQuality));
		Inn inn=new Inn(items);
		inn.updateQuality();
		BackstageItem result=(BackstageItem) inn.getItems().get(0);
		assertThat(result.getSellIn()).isEqualTo(initialSellin-1);
		assertThat(result.getQuality()).isEqualTo(initialQuality+1);
		
		items.clear();
		initialQuality=20;
		initialSellin=9;
		items.add(new BackstageItem("Backstage", initialSellin, initialQuality));
		inn=new Inn(items);
		inn.updateQuality();
		result=(BackstageItem)inn.getItems().get(0);
		assertThat(result.getQuality()).isEqualTo(initialQuality+2);
		
		items.clear();
		initialQuality=20;
		initialSellin=4;
		items.add(new BackstageItem("Backstage", initialSellin, initialQuality));
		inn=new Inn(items);
		inn.updateQuality();
		result=(BackstageItem)inn.getItems().get(0);
		assertThat(result.getQuality()).isEqualTo(initialQuality+3);
		
		items.clear();
		initialQuality=20;
		initialSellin=0;
		items.add(new BackstageItem("Backstage", initialSellin, initialQuality));
		inn=new Inn(items);
		inn.updateQuality();
		result=(BackstageItem)inn.getItems().get(0);
		assertThat(result.getQuality()).isEqualTo(0);
	}
	
	@Test
	public void testUpdateConjuredItem() {
		List<Item> items = new LinkedList<Item>();
		int initialSellin=20;
		int initialQuality=20;
		items.add(new ConjuredItem("Conjured", initialSellin, initialQuality));
		Inn inn=new Inn(items);
		inn.updateQuality();
		ConjuredItem result=(ConjuredItem) inn.getItems().get(0);
		assertThat(result.getSellIn()).isEqualTo(initialSellin-1);
		assertThat(result.getQuality()).isEqualTo(initialQuality-2);
		
		items.clear();
		initialQuality=20;
		initialSellin=-1;
		items.add(new ConjuredItem("Backstage", initialSellin, initialQuality));
		inn=new Inn(items);
		inn.updateQuality();
		result=(ConjuredItem)inn.getItems().get(0);
		assertThat(result.getQuality()).isEqualTo(initialQuality-4);
		
	}
	
	

}
