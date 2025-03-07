    package com.example.kt_ytal.Screens

    import androidx.lifecycle.ViewModel
    import kotlinx.coroutines.flow.MutableStateFlow
    import kotlinx.coroutines.flow.StateFlow
    import kotlinx.coroutines.flow.asStateFlow
    import kotlinx.coroutines.flow.update
    import kotlin.random.Random

    data class ModeloState(
        val botonTal: Int = 0
    )

    class ViewModelTal: ViewModel(){
        private val _uiState = MutableStateFlow(ModeloState())
        val uiState: StateFlow<ModeloState> = _uiState.asStateFlow()

        fun getTal(): Int {
            return ModeloState().botonTal;
        }

        init {
            getTal()
        }

        fun setButtonValue(value: Int){
            _uiState.update {
                currentState -> currentState.copy(
                    botonTal = value
                )
            }
        }

        fun botonRanding() {
            _uiState.update {
                currentState -> currentState.copy(
                    botonTal = Random.nextInt(from = 7, until = 1000)
                )
            }
        }
    }