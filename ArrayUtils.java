/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
//The code is from http://svn.apache.org/viewvc/commons/proper/lang/trunk/src/main/java/org/apache/commons/lang3/ArrayUtils.java?revision=1396075&view=co
import java.util.Arrays;

public class ArrayUtils {

	/**
	 * An empty immutable {@code int} array.
	 */
	public static final int[] EMPTY_INT_ARRAY = new int[0];
	// Int array converters
	// ----------------------------------------------------------------------
	/**
	 * An empty immutable {@code Integer} array.
	 */
	public static final Integer[] EMPTY_INTEGER_OBJECT_ARRAY = new Integer[0];

	/**
	 * <p>Converts an array of object Integers to primitives.</p>
	 *
	 * <p>This method returns {@code null} for a {@code null} input array.</p>
	 *
	 * @param array  a {@code Integer} array, may be {@code null}
	 * @return an {@code int} array, {@code null} if null array input
	 * @throws NullPointerException if array content is {@code null}
	 */
	public static int[] toPrimitive(Integer[] array) {
		if (array == null) {
			return null;
		} else if (array.length == 0) {
			return EMPTY_INT_ARRAY;
		}
		final int[] result = new int[array.length];
		for (int i = 0; i < array.length; i++) {
			result[i] = array[i].intValue();
		}
		return result;
	}

	/**
	 * <p>Converts an array of primitive ints to objects.</p>
	 *
	 * <p>This method returns {@code null} for a {@code null} input array.</p>
	 *
	 * @param array  an {@code int} array
	 * @return an {@code Integer} array, {@code null} if null array input
	 */
	public static Integer[] toObject(int[] array) {
		if (array == null) {
			return null;
		} else if (array.length == 0) {
			return EMPTY_INTEGER_OBJECT_ARRAY;
		}
		final Integer[] result = new Integer[array.length];
		for (int i = 0; i < array.length; i++) {
			result[i] = Integer.valueOf(array[i]);
		}
		return result;
	}
}
