package OOP.anonimClasses_4_10

class Sportsmen {
    fun invokeWaterBoy(waterBoy: WaterBoy) {
        waterBoy.bringWater()
    }

    inline fun invokeWaterBoy(bringWater: () -> Unit) {
        bringWater()
    }
}