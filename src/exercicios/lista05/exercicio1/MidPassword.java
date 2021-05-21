package exercicios.lista05.exercicio1;

import javax.sound.midi.spi.MidiDeviceProvider;

public class MidPassword extends Password{
    public MidPassword() {
        super("^(?=.*[A-Za-z])(?=.*)(?=.*[@$!%*#?&])[A-Za-z@$!%*#?&]{8,}$");
    }
}
