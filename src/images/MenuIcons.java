/*
 * MenuIcons.java
 *
 * Created on 29 ������ 2008 �., 18:31
 * Copyright (c) 2006-2008, Daniel Apatin (ad), http://apatin.net.ru
 *
 * This program is free software; you can redistribute it and/or
 * modify it under the terms of the GNU General Public License
 * as published by the Free Software Foundation; either version 2
 * of the License, or (at your option) any later version.
 *
 * You can also redistribute and/or modify this program under the
 * terms of the Psi License, specified in the accompanied COPYING
 * file, as published by the Psi Project; either dated January 1st,
 * 2005, or (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this library; if not, write to the Free Software
 * Foundation, Inc., 59 Temple Place, Suite 330, Boston, MA  02111-1307  USA
 */

package images;

import javax.microedition.lcdui.Graphics;
import ui.ImageList;

/**
 *
 * @author ad
 */
public class MenuIcons extends ImageList{
    
    private static MenuIcons instance;

    public static MenuIcons getInstance() {
	if (instance==null)
            instance=new MenuIcons();
	return instance;
    }

    private final static int ICONS_IN_ROW=8;
    private final static int ICONS_IN_COL=4;

    /** Creates a new instance of RosterIcons */
    private MenuIcons() {
	super("/images/menu.png", ICONS_IN_COL, ICONS_IN_ROW);
    }

    public void drawImage(Graphics g, int index, int x, int y) {
        super.drawImage(g, index, x, y);
    }

    public static final int ICON_URL = 0x15;
    //public static Integer iconHasVcard=new Integer(ICON_SEARCH_INDEX);
}