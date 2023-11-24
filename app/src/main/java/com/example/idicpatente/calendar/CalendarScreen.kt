package com.example.idicpatente.calendar

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import io.github.boguszpawlowski.composecalendar.SelectableCalendar
import io.github.boguszpawlowski.composecalendar.SelectableWeekCalendar
import io.github.boguszpawlowski.composecalendar.rememberSelectableCalendarState
import io.github.boguszpawlowski.composecalendar.selection.SelectionMode
import java.time.LocalDate
import java.time.YearMonth

@Composable
fun CalendarScreen(
    // navController: NavController
){
    SelectableCalendar(
        calendarState = rememberSelectableCalendarState(
            initialMonth = YearMonth.now(),
            initialSelection = listOf(LocalDate.now()),
            initialSelectionMode = SelectionMode.Period,
        )
    )
}

@Preview
@Composable
fun CalendarScreenPreview(){
    CalendarScreen()
}

