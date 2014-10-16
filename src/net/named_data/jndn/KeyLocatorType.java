/**
 * Copyright (C) 2014 Regents of the University of California.
 * @author: Jeff Thompson <jefft0@remap.ucla.edu>
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU Lesser General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>.
 * A copy of the GNU Lesser General Public License is in the file COPYING.
 */

package net.named_data.jndn;

/**
 * A KeyLocatorType specifies the key locator type in a KeyLocator object.
 */
public enum KeyLocatorType {
  NONE(0),
  KEYNAME(1),
  KEY_LOCATOR_DIGEST(2),
  KEY(3),
  CERTIFICATE(4);

  KeyLocatorType (int type)
  {
    type_ = type;
  }

  public final int
  getNumericType() { return type_; }

  private int type_;
}
