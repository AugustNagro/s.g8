package $organization$

import scala.annotation.elidable
import scala.annotation.elidable.ASSERTION

object Predef {
  @inline final def implicitly[A](implicit evidence: A): A = evidence

  @elidable(ASSERTION)
  @inline final def assert(assertion: Boolean): Unit =
    if(!assertion) throw new java.lang.AssertionError("assertion failed")

  @elidable(ASSERTION)
  @inline final def assert(assertion: Boolean, message: => Any): Unit =
    if(!assertion) throw new java.lang.AssertionError("assertion failed" + message)

  @inline final def print(i: Int): Unit = System.out.print(i)
  @inline final def print(c: Char): Unit = System.out.print(c)
  @inline final def print(s: String): Unit = System.out.print(s)
  @inline final def print(f: Float): Unit = System.out.print(f)
  @inline final def print(d: Double): Unit = System.out.print(d)
  @inline final def print(l: Long): Unit = System.out.print(l)
  @inline final def print(b: Boolean): Unit = System.out.print(b)
  @inline final def print(s: Array[Char]): Unit = System.out.print(s)
  @inline final def print(obj: AnyRef): Unit = System.out.print(obj)

  @inline final def println(i: Int): Unit = System.out.println(i)
  @inline final def println(c: Char): Unit = System.out.println(c)
  @inline final def println(s: String): Unit = System.out.println(s)
  @inline final def println(f: Float): Unit = System.out.println(f)
  @inline final def println(d: Double): Unit = System.out.println(d)
  @inline final def println(l: Long): Unit = System.out.println(l)
  @inline final def println(b: Boolean): Unit = System.out.println(b)
  @inline final def println(s: Array[Char]): Unit = System.out.println(s)
  @inline final def println(obj: AnyRef): Unit = System.out.println(obj)

}
