/*                     __                                               *\
**     ________ ___   / /  ___     Scala API                            **
**    / __/ __// _ | / /  / _ |    (c) 2002-2010, LAMP/EPFL             **
**  __\ \/ /__/ __ |/ /__/ __ |    http://scala-lang.org/               **
** /____/\___/_/ |_/____/_/ | |                                         **
**                          |/                                          **
\*                                                                      */

// $Id$

// generated by genprod on Mon Apr 12 15:28:18 CEST 2010

package scala




/** Tuple5 is the canonical representation of a @see Product5
 *
 */
case class Tuple5[+T1, +T2, +T3, +T4, +T5](_1:T1,_2:T2,_3:T3,_4:T4,_5:T5)
  extends Product5[T1, T2, T3, T4, T5]
{
  override def toString() = "(" + _1 + "," + _2 + "," + _3 + "," + _4 + "," + _5 + ")"

}
