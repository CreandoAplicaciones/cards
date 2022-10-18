package com.cartones.bingo.en.casa.ui.base

sealed class BaseEvent {
    data class ShowMessage(val message: Int): BaseEvent()
    data class ShowLoading(val visibility: Boolean): BaseEvent()
}