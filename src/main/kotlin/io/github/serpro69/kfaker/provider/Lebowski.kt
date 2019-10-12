package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*

/**
 * [FakeDataProvider] implementation for [CategoryName.LEBOWSKI] category.
 */
@Suppress("unused")
class Lebowski internal constructor(fakerService: FakerService) : AbstractFakeDataProvider<Lebowski>(fakerService) {
    override val categoryName = CategoryName.LEBOWSKI

    fun actors() = resolve("actors")
    fun characters() = resolve("characters")
    fun quotes() = resolve("quotes")
}
