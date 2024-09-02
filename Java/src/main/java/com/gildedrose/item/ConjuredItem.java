package com.gildedrose.item;

import com.gildedrose.Item;
import com.gildedrose.ItemUpdate;

public class ConjuredItem implements ItemUpdate {

	@Override
	public void update(Item item) {
		if (item.sellIn > 0) {
            item.quality = Math.max(0, item.quality - 2);
        } else {
            item.quality = Math.max(0, item.quality - 4);
        }
        item.sellIn--;
	}

}
