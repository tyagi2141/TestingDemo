package com.example.testingdemo

import android.content.Context
import androidx.test.core.app.ApplicationProvider
import com.google.common.truth.Truth.assertThat
import org.junit.Before
import org.junit.Test

class ResourceCompareTest{

  private  lateinit var resourceComparator : ResourceCompare

  @Before
   fun setup(){
       resourceComparator = ResourceCompare()
   }


    @Test
    fun stringComparatorCheck_returnTrue(){
        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparator.isEqual(context,R.string.app_name,"TestingDemo")
        assertThat(result).isTrue()
    }


    @Test
    fun stringComaratorCheck_returnfalse(){

        val context = ApplicationProvider.getApplicationContext<Context>()
        val result = resourceComparator.isEqual(context,R.string.app_name,"Texting")
        assertThat(result).isTrue()
    }
}