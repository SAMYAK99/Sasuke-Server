package com.naruto


import com.naruto.models.ApiResponse
import com.naruto.plugins.configureRouting
import com.naruto.repositories.HeroRepositoryImpl
import com.naruto.repositories.NEXT_PAGE_KEY
import com.naruto.repositories.PREVIOUS_PAGE_KEY
import io.ktor.client.request.*
import io.ktor.client.statement.*
import io.ktor.http.*
import io.ktor.server.testing.*
import kotlinx.serialization.ExperimentalSerializationApi
import kotlinx.serialization.json.Json
import kotlin.test.Test
import kotlin.test.assertEquals

class ApplicationTest {
    @Test
    fun `access root endpoint, and asserting correct information`() =
        testApplication {
            val response = client.get("/")
            assertEquals(
                expected = HttpStatusCode.OK,
                actual = response.status
            )
            assertEquals(
                expected = "Welcome to Sasuke API",
                actual = response.bodyAsText()
            )
        }


}
