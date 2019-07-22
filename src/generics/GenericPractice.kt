package generics

open class BaseBuildingMaterial(val numberNeeded: Int = 1)

class Wood : BaseBuildingMaterial(4)

class Brick : BaseBuildingMaterial(8)


class Building<T : BaseBuildingMaterial>(buildingMaterial: T) {
    private val baseMaterialsNeeded = 1000
    val actualMaterialsNeeded = baseMaterialsNeeded - buildingMaterial.numberNeeded
}
