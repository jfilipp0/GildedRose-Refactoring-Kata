package com.gildedrose.item;

import com.gildedrose.Item;
import com.gildedrose.ItemUpdate;

public class NormalItem implements ItemUpdate {

	@Override
	public void update(Item item) {
		if (item.sellIn > 0) {
            item.quality = Math.max(0, item.quality - 1);
        } else {
            item.quality = Math.max(0, item.quality - 2);
        }
        item.sellIn--;
	}

}
