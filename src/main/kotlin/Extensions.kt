@file:JvmName("Ext")
/**
 * @Author STAR
 * @Description public函数拓展
 * @Date 2022/8/1 22:23
 */
fun <T> T.easyPrint(): T {
    println(this)
    return this
}