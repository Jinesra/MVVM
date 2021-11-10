package com.example.mvvmapp

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*


/*
 *      MainViewModel
 *      - viewModel that updates the MainFragment (the visible UI)
 *      - gets the data from model
 */
class MainViewModel: ViewModel() {

    // Create the model which contains data for our UI
    private val arrayList =
        Arrays.asList(
            "Block 1: "+
                    "Getting started",
            "Block 2: "+
                    "UI development",
            "Block 3: "+
                    "UI customization and animations",
            "Block 4: "+
                    "UI collections",
            "Block 5: "+
                    "Asynchronous programming",
            "Block 6: "+
                    "Networking",
            "Block 7: "+
                    "Permissions",
            "Block 8: "+
                    "3d-parties",
            "Block 9: "+
                    "Architecture 1",
            "Block 10: "+
                    "Architecture 2",
            "Block 11: "+
                    "App submission and CI/CD"
        )

    // Create MutableLiveData which MainFragment can subscribe to
    // When this data changes, it triggers the UI to do an update
    val uiTextLiveData = MutableLiveData<String>()

    private val getRandomString: String
        private get() {
            val random = Random()
            val index = random.nextInt(arrayList.size)
            return arrayList[index]
        }

    // Get the updated text from our model and post the value to MainFragment
    fun getUpdatedText() {
        val updatedText = getRandomString
        uiTextLiveData.postValue(updatedText)
    }
}