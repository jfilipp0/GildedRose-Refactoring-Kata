package com.gildedrose.item;

import com.gildedrose.Item;
import com.gildedrose.ItemUpdate;

public class AgedBrieItem implements ItemUpdate {

	@Override
	public void update(Item item) {
		if (item.quality < 50) {
            item.quality++;
        }
        item.sellIn--;
	}

}
