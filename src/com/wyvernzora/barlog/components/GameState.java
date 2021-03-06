/* Barlog Game Engine
 * Copyright (C) 2011 Jieni Luchijinzhou a.k.a. Denis Luchkin-Zhou
 * -----------------------------------------------------------------------
 * /com/wyvernzora/engine/components/GameState.java
 * -----------------------------------------------------------------------
 * 
 * This is a single game-level layer unit.
 * GameState contains input handling code.
 * Generally, GameState is an abstraction of input handling that was supposed
 * to be handled in rendering pane.
 * 
 * 
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 */

package com.wyvernzora.barlog.components;

import java.awt.event.KeyListener;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import com.wyvernzora.barlog.Game;

public abstract class GameState extends DrawableCompositeGameComponent 
										implements KeyListener, MouseListener, MouseMotionListener {

	public GameState(Game gm) {
		super(gm);
		
	}

}
