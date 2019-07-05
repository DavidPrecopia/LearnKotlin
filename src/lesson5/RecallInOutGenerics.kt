package lesson5

/**
 * THESE RULES PRESERVE THE "IS-A" RELATIONSHIP
 * Additionally, these rules ensures that what ever is calling the method in question will be able to use it regardless of what
 * exact sub-type they are using - thus maintaining the Substitution Principle.
 *
 * Accept: broader then the super-type.
 * If you narrow the accept type, the caller might not be able to call it.
 * E.g., going from Cat to Russian Blue, would break any caller passing any other Cat, or even a Cat itself.
 * However, going from Cat to Animal works because all Cats are Animals.
 *
 * Return: narrower then the super-type.
 * An Animal is not necessarily a Cat, it could also be a Dog - if return could expand, you could go form return a Cat, to a Dog.
 * However, a Blue is a Russian Blue is a Cat, thus maintains the "IS-A" relationship.
 *
 *
 * You can think of the above as (to use Java parlance):
 * public < foo(> value);
 *
 *
 * To recap:
 * - Accept: expand - an Russian Blue is a Cat && an Animal - while a Maine Coon is not a Russian Blue.
 * - Return: narrow - a Russian Blue is a Cat, while a Bulldog is not.
 */

/**
 * `in` and `out` enforce type-safety.
 *
 * You could safely add Strings to a List of Object - HOWEVER, you cannot safely add Objects to a List of Strings.
 *
 * For example, val myList: listOf<Any> = listOf<String>
 * This is OK, as long as you exclusively READ (out) from myList, WRITING (in) is an issue because you could mix Strings with non-Strings.
 *
 * in
 * - Class C is a producer of Ts, not a consumer.
 *
 * out
 * - Class C is a consumer of Ts, not a producer.
 */

fun main() {

}
