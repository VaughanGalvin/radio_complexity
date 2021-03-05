package ru.netology.radio;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {
    @Test
    public void shouldRunRadio() {
        Radio variable = new Radio();
        assertEquals(0, variable.getMinChannel());
        assertEquals(9, variable.getMaxChannel());
        assertEquals(0, variable.getMinVolume());
        assertEquals(10, variable.getMaxVolume());
    }

   @Test // взять следующий канал
    public void shouldGetNextChannel(){
        Radio specimen = new Radio();
        specimen.setCurrentChannel(8); // установить текущий канал
        specimen.NextChannel(); // вызвать метод получения следующего канала, добавляющий +1
        int expected = 9; // предсказать какой будет канал
        assertEquals(expected, specimen.getCurrentChannel()); // сравнить ожидаемое и новое состояние канала
   }
   @Test // взять следующий канал больше возможного
    public void shouldGetNextChannelExtra(){
        Radio specimen = new Radio();
        specimen.setCurrentChannel(9); // установить текущий канал на максимум
        specimen.NextChannel(); // вызвать метод получения следующего канала, добавляющий +1
        int expected = 0; // предсказать какой будет канал (по кругу должен приравняться к минимальному)
        assertEquals(expected, specimen.getCurrentChannel()); // сравнить ожидаемое и новое состояние канала
   }
    @Test // взять предыдущий канал
    public void shouldGetPrevChannel(){
        Radio specimen = new Radio();
        specimen.setCurrentChannel(5); // установить текущий канал
        specimen.PrevChannel(); // вызвать метод получения предыдущего канала, отнимающий -1
        int expected = 4; // предсказать какой будет канал
        assertEquals(expected, specimen.getCurrentChannel()); // сравнить ожидаемое и новое состояние канала
   }
    @Test // взять предыдущий канал меньше минимума
    public void shouldGetPrevChannelExtra(){
        Radio specimen = new Radio();
        specimen.setCurrentChannel(0); // установить текущий канал предельно минимальным
        specimen.PrevChannel(); // вызвать метод получения предыдущего канала, отнимающий -1
        int expected = 9; // предсказать какой будет канал (по кругу должно быть 9)
        assertEquals(expected, specimen.getCurrentChannel()); // сравнить ожидаемое и новое состояние канала
   }
    @Test // взять следующий звук
    public void shouldGetNextVolume(){
        Radio specimen = new Radio();
        specimen.setCurrentVolume(5); // установить текущий звук
        specimen.nextVolume(); // вызвать метод получения следующего звука, добавляющий +1
        int expected = 6; // предсказать какой будет звук
        assertEquals(expected, specimen.getCurrentVolume()); // сравнить ожидаемое и новое состояние канала
   }
    @Test // взять следующий звук больше максимума
    public void shouldGetNextVolumeExtra(){
        Radio specimen = new Radio();
        specimen.setCurrentVolume(10); // установить текущий звук на максимум
        specimen.nextVolume(); // вызвать метод получения следующего звука, добавляющий +1
        int expected = 10; // предсказать какой будет звук (стоим на месте)
        assertEquals(expected, specimen.getCurrentVolume()); // сравнить ожидаемое и новое состояние звука
   }
    @Test // взять предыдущий звук
    public void shouldGetPrevVolume(){
        Radio specimen = new Radio();
        specimen.setCurrentVolume(8); // установить текущий звук
        specimen.prevVolume(); // вызвать метод получения предыдущего звука, отнимающий -1
        int expected = 7; // предсказать какой будет звук
        assertEquals(expected, specimen.getCurrentVolume()); // сравнить ожидаемое и новое состояние звука
   }
    @Test // взять предыдущий звук меньше минимума
    public void shouldGetPrevVolumeExtra(){
        Radio specimen = new Radio();
        specimen.setCurrentVolume(0); // установить текущий звук на минимум
        specimen.prevVolume(); // вызвать метод получения предыдущего звука, отнимающий -1
        int expected = 0; // предсказать какой будет звук (стоим на месте)
        assertEquals(expected, specimen.getCurrentVolume()); // сравнить ожидаемое и новое состояние звука
   }

   /* тесты из-за 100% покрытия:
   текущий канал
   текущий звук
   минимальный канал
   максимальный канал
   максимальный звук
   минимальный звук
    */

    @Test // установить текущий канал в ожидаемом диапазоне
    public void shouldSetCurrentChannel(){
        Radio specimen = new Radio();
        specimen.setCurrentChannel(2);
        int expected = 2; // предсказать какой будет канал
        assertEquals(expected, specimen.getCurrentChannel()); // сравнить ожидаемое и новое состояние звука
   }

   @Test // установить текущий канал больше максимума
    public void shouldSetCurrentChannelExtra(){
        Radio specimen = new Radio();
        specimen.setCurrentChannel(10);
        int expected = 0; // предсказать какой будет канал
        assertEquals(expected, specimen.getCurrentChannel()); // сравнить ожидаемое и новое состояние звука
   }

@Test // установить текущий канал меньше минимума
    public void shouldSetCurrentChannelExtraLow(){
        Radio specimen = new Radio();
        specimen.setCurrentChannel(-1);
        int expected = 9; // предсказать какой будет канал
        assertEquals(expected, specimen.getCurrentChannel()); // сравнить ожидаемое и новое состояние звука
   }

@Test // установить текущий звук больше максимума
    public void shouldSetCurrentVolumeExtra(){
        Radio specimen = new Radio();
        specimen.setCurrentVolume(11);
        int expected = 10; // вернуть максимум
        assertEquals(expected, specimen.getCurrentVolume()); // сравнить ожидаемое и новое состояние звука
   }

@Test // установить текущий звук меньше минимума
    public void shouldSetCurrentVolumeExtraLow(){
        Radio specimen = new Radio();
        specimen.setCurrentVolume(-1);
        int expected = 0; // вернуть минимум
        assertEquals(expected, specimen.getCurrentVolume()); // сравнить ожидаемое и новое состояние звука
   }


   @Test // установить текущий звук
    public void shouldSetCurrentVolume(){
        Radio specimen = new Radio();
        specimen.setCurrentVolume(2);
        int expected = 2; // предсказать какой будет звук
        assertEquals(expected, specimen.getCurrentVolume()); // сравнить ожидаемое и новое состояние звука
   }

    @Test // установить минимальный канал
    public void shouldSetMinChannel(){
        Radio specimen = new Radio();
        specimen.setMinChannel(0);
        int expected = 0; // предсказать какой будет канал
        assertEquals(expected, specimen.getMinChannel()); // сравнить ожидаемое и новое состояние звука
   }

    @Test // установить максимальный канал
    public void shouldSetMaxChannel(){
        Radio specimen = new Radio();
        specimen.setMaxChannel(10);
        int expected = 10; // предсказать какой будет звук (стоим на месте)
        assertEquals(expected, specimen.getMaxChannel()); // сравнить ожидаемое и новое состояние звука
   }

    @Test // установить минимальный звук
    public void shouldSetMinVolume(){
        Radio specimen = new Radio();
        specimen.setMinVolume(0);
        int expected = 0; // предсказать какой будет звук (стоим на месте)
        assertEquals(expected, specimen.getMinVolume()); // сравнить ожидаемое и новое состояние звука
   }

    @Test // установить максимальный звук
    public void shouldSetMaxVolume(){
        Radio specimen = new Radio();
        specimen.setMaxVolume(10);
        int expected = 10; // предсказать какой будет звук (стоим на месте)
        assertEquals(expected, specimen.getMaxVolume()); // сравнить ожидаемое и новое состояние звука
   }


} // скобка класса