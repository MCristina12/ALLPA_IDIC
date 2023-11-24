package com.example.idicpatente.calendar

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.idicpatente.main.TopBar
import io.github.boguszpawlowski.composecalendar.SelectableCalendar
import io.github.boguszpawlowski.composecalendar.SelectableWeekCalendar
import io.github.boguszpawlowski.composecalendar.rememberSelectableCalendarState
import io.github.boguszpawlowski.composecalendar.selection.SelectionMode
import java.time.LocalDate
import java.time.YearMonth

@Composable
fun CalendarScreen(
    navController: NavController
){
    Column(
        modifier = Modifier.fillMaxSize()
    ) {
        TopBar(texto = "CALENDARIO")
        Column(
            modifier = Modifier.fillMaxWidth().padding(start = 12.dp, end = 12.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            SelectableCalendar(
                calendarState = rememberSelectableCalendarState(
                    initialMonth = YearMonth.now(),
                    initialSelection = listOf(LocalDate.now()),
                    initialSelectionMode = SelectionMode.Period,
                ),
                modifier = Modifier.padding(top = 12.dp).align(Alignment.CenterHorizontally)
            )
        }
    }
}


