package com.woodwing.fpws.functional


object monad {

  /** multiplies n by 2 */
  val f: Int ⇒ Int = (n) ⇒
    2 * n

  /** multiplies n by 4 */
  val g: Int ⇒ Int = (n) ⇒
    4 * n

  /** == composition ==
    * calls f on n and g on the result of f(n)
    * {{{
    *        +---+    +---+
    *   n -> | f | -> | g | -> f g n
    *        +---+    +---+
    *
    *   or just `g(f(n))`
    * }}}
    */
  val fg = f andThen g

  /** or in this case the equivalent */
  val cfg = g compose f

  /** == '''SIDE EFFECT''' ==
    * logs a statement and multiplies n by 2
    */
  val lf: Int ⇒ Int = { n ⇒
    println(s"lf called")
    n * 2
  }

  /** == '''NO SIDE EFFECT''' ==
    * multiplies n by 2 and returns a ''tuple'' containing the result + a debug statement
    * {{{
    *        +---+
    *   n -> | f | -> (f n, "f was called.")
    *        +---+
    * }}}
    */
  val df: Int ⇒ (Int, String) = (n) ⇒
    (2 * n) → "f was called."

  val dg: Int ⇒ (Int, String) = (n) ⇒
    (4 * n) → "g was called."

  /** We want to compose these functions so we get the end result as the first tuple element
    * and the debug strings concatenated as the second tuple element; f after g
    * `f(g(x)) -> "g was called.f was called.`
    *
    * This is not as straightforward as just composing `f` and `g` as the result type of `g`
    * does not equal the argument type of `f`.
    *
    * @example {{{
    *   val dgdf = df compose dg // does not compile
    * }}}
    */
  val doesNotCompile: Int ⇒ (Int, String) = (n) ⇒ ???
//    df andThen dg

  val x = 5
  val (y, s) = dg(x)
  val (z, t) = df(y)
  val r = (z * y, s + t)

  /** We could write it as:
    * {{{
    *   val r1: (Int -> String) = dg(n)
    *   val r2: (Int -> String) = df(n)
    *   r1._1 * r2._1 -> r1._2 + r2._2
    * }}}
    *
    * It would look like this:
    * {{{
    *      x
    *      |
    *    +---+
    *    | g'|
    *    +---+
    *     |   \
    *   +---+  | "g was called."
    *   | f'|  |
    *   +---+  |
    *    | \   |
    *    |  \  |
    *    |  +----+
    *    |  | ++ |
    *    |  +----+
    *    |     |
    * f (g x) "g was called.f was called."
    * }}}
    */

  /** f needs to be upgraded, we introduce a new function `bind` such that
    * {{{
    *   bind f = (Int, String) => (Int, String) = ???
    * }}}
    *
    * which implies that:
    */
//  val bind: (Int ⇒ (Int, String)) ⇒ ((Int, String) ⇒ (Int, String)) = ???

  /*
   * Bind must serve 2 purposes: it must (1)
   */

  type DebugResult = (Int, String)
//  val bind: (Int ⇒ DebugResult) ⇒ (DebugResult ⇒ DebugResult) =
//    (gx) ⇒ df(gx)

//  val bind









//  abstract class Monad[A](val a: A) {
//    def bind(m: Monad): Monad
//
//    def identity: A = a
//  }
}
