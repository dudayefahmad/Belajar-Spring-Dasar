package com.ahmaddudayef.belajarspringdasar

object Database {

    private var database: Database? = null
    val instance: Database?
        get() {
            if (database == null) {
                database = Database
            }
            return database
        }
}