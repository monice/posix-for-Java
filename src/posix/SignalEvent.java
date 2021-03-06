package posix;

/**
 * An event thrown when a posix signal is trapped.
 * 
 * @author <a href="mailto:stuart@bmsi.com">Stuart D. Gathman</a> Copyright (C)
 *         1998 Business Management Systems, Inc.
 *         <p>
 *         This code is distributed under the
 *         <a href="http://www.gnu.org/copyleft/lgpl.html"> GNU Library General
 *         Public License </a>
 *         <p>
 *         This library is free software; you can redistribute it and/or modify
 *         it under the terms of the GNU Library General Public License as
 *         published by the Free Software Foundation; either version 2 of the
 *         License, or (at your option) any later version.
 *         <p>
 *         This library is distributed in the hope that it will be useful, but
 *         WITHOUT ANY WARRANTY; without even the implied warranty of
 *         MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 *         Library General Public License for more details.
 *         <p>
 *         You should have received a copy of the GNU Library General Public
 *         License along with this library; if not, write to the Free Software
 *         Foundation, Inc., 59 Temple Place - Suite 330, Boston, MA 02111-1307,
 *         USA.
 */

public class SignalEvent extends java.util.EventObject {
	private static final long serialVersionUID = 7795847022443717822L;

	SignalEvent(Signal sig) {
		super(sig);
	}
}
