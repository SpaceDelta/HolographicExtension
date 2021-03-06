/*
 *  Holographic Extension
 *  Copyright (C) 2015 - 2019 Niall7459
 *
 *  This program is free software: you can redistribute it and/or modify
 *  it under the terms of the GNU General Public License as published by
 *  the Free Software Foundation, either version 3 of the License, or
 *  (at your option) any later version.
 *
 *  This program is distributed in the hope that it will be useful,
 *  but WITHOUT ANY WARRANTY; without even the implied warranty of
 *  MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 *  GNU General Public License for more details.
 *
 *  You should have received a copy of the GNU General Public License
 *  along with this program.  If not, see <https://www.gnu.org/licenses/>.
 */
package net.kitesoftware.holograms.animation.impl;

import net.kitesoftware.holograms.animation.Animation;
import org.bukkit.ChatColor;

import java.util.ArrayList;
import java.util.List;

public class Erase implements Animation {

    @Override
    public String getName() {
        return "erase";
    }

    @Override
    public List<String> create(String text) {
        List<String> frames = new ArrayList<>();

        String lastColor = ChatColor.getLastColors(text);
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < text.length(); i++) {
            sb.append(" ");
            String cutText = text.substring(i);

            frames.add(sb.toString() + lastColor + cutText);
        }

        return frames;
    }

}
