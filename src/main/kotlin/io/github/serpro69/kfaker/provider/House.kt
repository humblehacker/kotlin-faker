package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*

/**
 * [FakeDataProvider] implementation for [CategoryName.HOUSE] category.
 */
@Suppress("unused")
class House internal constructor(fakerService: FakerService) : AbstractFakeDataProvider<House>(fakerService) {
    override val categoryName = CategoryName.HOUSE

    fun furniture() = resolve("furniture")
    fun rooms() = resolve("rooms")
}
