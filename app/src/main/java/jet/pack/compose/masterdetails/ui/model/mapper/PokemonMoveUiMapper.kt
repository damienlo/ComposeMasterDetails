package jet.pack.compose.masterdetails.ui.model.mapper

import jet.pack.compose.masterdetails.domain.model.Move
import jet.pack.compose.masterdetails.ui.model.PokemonMoveUiModel
import java.util.*

class PokemonMoveUiMapper(private val typeUiMapper: PokemonTypeUiMapper) {

    fun map(move: Move): PokemonMoveUiModel = PokemonMoveUiModel(
        name = move.name.capitalize(Locale.getDefault()),
        description = move.description,
        accuracy = move.accuracy?.toString() ?: "-",
        power = move.power?.toString() ?: "-",
        type = typeUiMapper.map(move.type)
    )
}