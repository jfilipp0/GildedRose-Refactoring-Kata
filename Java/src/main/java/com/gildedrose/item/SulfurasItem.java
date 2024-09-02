package com.gildedrose.item;

import com.gildedrose.Item;
import com.gildedrose.ItemUpdate;

public class SulfurasItem implements ItemUpdate {

	@Override
	public void update(Item item) {
		// Sulfuras does not change in quality or sellIn
		// if the propperty change just update this code :)
		if(item.quality == 80) {
			item.quality = 80;
		}
		item.sellIn -= 1;
	}
}
