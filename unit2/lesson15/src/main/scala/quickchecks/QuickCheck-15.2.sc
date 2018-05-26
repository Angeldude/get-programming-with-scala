// Can you rewrite any anonymous function as a partial function? What about the vice versa?


// ANSWER
// You can rewrite any anonymous function as a partial function by adding the keyword case and
// changing its type signature. For example, consider the following anonymous function:

// val toPrettyString: Any => String = { obj => obj.toString }

// You can re-implement it as a partial function as follows:

val toPrettyString: PartialFunction[Any, String] = {
  case obj => obj.toString }

// Vice versa, transforming any partial function to an anonymous function is not possible.
