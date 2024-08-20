fun main() {
   var s= Square()
   var t= Triangle()
   s.draw()
   t.draw()
    
}
interface Drawable{
    fun draw()
}
class Square() : Drawable
{
   override fun draw()
    {
        println(" draw square")
    }
}
class Triangle(): Drawable
{
    override fun draw()
    {
        println(" draw Triangle")
    }
}