package com.cartones.bingo.en.casa.ui.view.cards

import androidx.lifecycle.viewModelScope
import com.cartones.bingo.en.casa.ui.base.BaseViewModel
import kotlinx.coroutines.channels.Channel
import kotlinx.coroutines.flow.receiveAsFlow
import kotlinx.coroutines.launch

class CardsBingoViewModel : BaseViewModel() {

    sealed class Event {
    }

    private val eventChannel = Channel<Event>(Channel.BUFFERED)
    val eventsFlow = eventChannel.receiveAsFlow()

    //region ViewModel Input
    fun initFlow() {

    }


    //endregion

    //region ViewModel Output
    private fun doAction(event: Event) {
        viewModelScope.launch {
            eventChannel.send(event)
        }
    }
    //endregion
}