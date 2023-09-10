package com.jetbrains.handson.kmm.shared.cache

import com.squareup.sqldelight.db.SqlDriver
import com.squareup.sqldelight.sqlite.driver.JdbcSqliteDriver

actual class DatabaseDriverFactory {
    actual fun createDriver(): SqlDriver {
//        val driver: SqlDriver = JdbcSqliteDriver(JdbcSqliteDriver.IN_MEMORY)
        val driver: SqlDriver = JdbcSqliteDriver("jdbc:sqlite:test:db")
        AppDatabase.Schema.create(driver)
        return driver
    }
}