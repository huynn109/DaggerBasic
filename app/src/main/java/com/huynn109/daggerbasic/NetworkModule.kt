package com.huynn109.daggerbasic

import dagger.Module
import dagger.Provides
import okhttp3.OkHttpClient
import retrofit2.Retrofit

@Module
class NetworkModule {

    @Provides
    fun provideLoginRetrofitService(okHttpClient: OkHttpClient): LoginService {
        return Retrofit.Builder().baseUrl("https://en.wikipedia.org/w/")
            .client(okHttpClient)
            .build().create(LoginService::class.java)
    }

    @Provides
    fun provideOkHttpClient(): OkHttpClient {
        return OkHttpClient.Builder().build()
    }
}