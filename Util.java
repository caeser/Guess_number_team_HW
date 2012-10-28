/* Copyright (C) 2003 Univ. of Massachusetts Amherst, Computer Science Dept.
   This file is part of "MALLET" (MAchine Learning for LanguagE Toolkit).
http://www.cs.umass.edu/~mccallum/mallet
This software is provided under the terms of the Common Public License,
version 1.0, as published by http://www.opensource.org.  For further
information, see the file `LICENSE' included with this distribution. */

//This file is from : http://www.java2s.com/Code/Java/Collections-Data-Structure/Appendonearraytoanother.htm

//package cc.mallet.util;

import java.lang.reflect.Array;

/**
 * Static utility methods for arrays (like java.util.Arrays, but more useful).
 * 
 * @author <a href="mailto:casutton@cs.umass.edu">Charles Sutton</a>
 * @version $Id: ArrayUtils.java,v 1.1 2007/10/22 21:37:40 mccallum Exp $
 */
public class Util {
	/**
	 * Returns a new array that is the concatenation of a1 and a2.
	 * 
	 * @param a1
	 * @param a2
	 * @return
	 */
	public static int[] append(int[] a1, int[] a2) {
		int[] ret = new int[a1.length + a2.length];
		System.arraycopy(a1, 0, ret, 0, a1.length);
		System.arraycopy(a2, 0, ret, a1.length, a2.length);
		return ret;
	}
}
