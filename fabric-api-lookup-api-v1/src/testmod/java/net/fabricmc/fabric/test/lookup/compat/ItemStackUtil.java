/*
 * Copyright (c) 2016, 2017, 2018, 2019 FabricMC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.fabricmc.fabric.test.lookup.compat;

import net.minecraft.item.ItemStack;

final class ItemStackUtil {
	public static boolean areEqualIgnoreCount(ItemStack s1, ItemStack s2) {
		return s1.getItem() == s2.getItem() && ItemStack.areNbtEqual(s1, s2);
	}

	private ItemStackUtil() {
	}
}
