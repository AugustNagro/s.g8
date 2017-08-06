package $root_package$

import scala.annotation.elidable
import scala.annotation.elidable.ASSERTION

package object $sub_package$ {

  @inline private[$sub_package$] final def implicitly[A](implicit evidence: A): A = evidence

  @elidable(ASSERTION)
  @inline private[$sub_package$] final def assert(assertion: Boolean): Unit =
    if(!assertion) throw new java.lang.AssertionError("assertion failed")

  @elidable(ASSERTION)
  @inline private[$sub_package$] final def assert(assertion: Boolean, message: => Any): Unit =
    if(!assertion) throw new java.lang.AssertionError("assertion failed" + message)

  @inline private[$sub_package$] final def print(i: Int): Unit = System.out.print(i)
  @inline private[$sub_package$] final def print(c: Char): Unit = System.out.print(c)
  @inline private[$sub_package$] final def print(s: String): Unit = System.out.print(s)
  @inline private[$sub_package$] final def print(f: Float): Unit = System.out.print(f)
  @inline private[$sub_package$] final def print(d: Double): Unit = System.out.print(d)
  @inline private[$sub_package$] final def print(l: Long): Unit = System.out.print(l)
  @inline private[$sub_package$] final def print(b: Boolean): Unit = System.out.print(b)
  @inline private[$sub_package$] final def print(s: Array[Char]): Unit = System.out.print(s)
  @inline private[$sub_package$] final def print(obj: AnyRef): Unit = System.out.print(obj)

  @inline private[$sub_package$] final def println(i: Int): Unit = System.out.println(i)
  @inline private[$sub_package$] final def println(c: Char): Unit = System.out.println(c)
  @inline private[$sub_package$] final def println(s: String): Unit = System.out.println(s)
  @inline private[$sub_package$] final def println(f: Float): Unit = System.out.println(f)
  @inline private[$sub_package$] final def println(d: Double): Unit = System.out.println(d)
  @inline private[$sub_package$] final def println(l: Long): Unit = System.out.println(l)
  @inline private[$sub_package$] final def println(b: Boolean): Unit = System.out.println(b)
  @inline private[$sub_package$] final def println(s: Array[Char]): Unit = System.out.println(s)
  @inline private[$sub_package$] final def println(obj: AnyRef): Unit = System.out.println(obj)

}
