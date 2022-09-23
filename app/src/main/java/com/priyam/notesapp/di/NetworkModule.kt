package com.priyam.notesapp.di;

import android.provider.SyncStateContract;
import com.priyam.notesapp.api.UserApi
import com.priyam.notesapp.utils.Constants
import com.priyam.notesapp.utils.Constants.BASE_URL

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import dagger.hilt.InstallIn;
import dagger.hilt.components.SingletonComponent;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

@InstallIn(SingletonComponent::class)
@Module
class NetworkModule {

    @Singleton
    @Provides
    fun providesRetrofit(): Retrofit.Builder {
        return  Retrofit.Builder().baseUrl(Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create())
    }


    @Singleton
    @Provides
    fun providesUserAPI(retrofitBuilder: Retrofit.Builder): UserApi {
        return retrofitBuilder.build().create(UserApi::class.java)
    }

}
