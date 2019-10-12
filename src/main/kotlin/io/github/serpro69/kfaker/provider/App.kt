package io.github.serpro69.kfaker.provider

import io.github.serpro69.kfaker.*
import io.github.serpro69.kfaker.dictionary.*

/**
 * [FakeDataProvider] implementation for [CategoryName.APP] category.
 */
@Suppress("unused")
class App internal constructor(fakerService: FakerService) : AbstractFakeDataProvider<App>(fakerService) {
    override val categoryName = CategoryName.APP

    fun name() = resolve("name")
    fun version() = resolve("version")
    fun author() = resolve("author")
}