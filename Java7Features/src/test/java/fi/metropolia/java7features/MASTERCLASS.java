package fi.metropolia.java7features;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class StringSwitchTest {

	private StringSwitch switchThursday;
	private StringSwitch switchDefault;

	@Before
	public void setup() {
		switchThursday = new StringSwitch("thursday");
		switchDefault = new StringSwitch("default");
	}

	@Test
	public void thursdaySwitch() {
		assertEquals(switchThursday.getDayNumber(), 3);
	}

	@Test
	public void defaultSwitch() {
		assertEquals(switchDefault.getDayNumber(), 0);
	}

}

░░░░░░░░░░░░░░░░░░
░░░░▓▓▀▀██████▓▄▒▒░░░
░░░▀░░░░░░▀▀▀████▄▒░░░
░░▌░░░░░░░░░░░▀███▓▒░░ 
░▌░░░░░▄▄▄░░░░░░▐█▓▒░░░
░▄▓▀█▌░▀██▀▒▄░░░▐▓▓▓▒░ 
░█▌░░░░░▀▒░░░▀░░░▐▓▒▒░░ 
░▌▀▒▄▄░░░░░░░░░░░░░▄▒░░ 
░▒▄█████▌▒▒░░░░░░░▒▌▒░ 
░░▓█████▄▒░▒▒▒░░░░░▐░
░░▒▀▓▒░░░░░░░▒▒░▒▒▒▄░
░░▓▒▒▒░░░░░░▒▒▒▒▒░▓░░
░░████▄▄▄▄▓▓▓▒▒░░▐░░
░░░▀██████▓▒▒▒▒▒░▐░

* g o a t s e x * g o a t s e x * g o a t s e x *
g                                               g  
o /     \             \            /    \       o
a|       |             \          |      |      a
t|       `.             |         |       :     t
s`        |             |        \|       |     s
e \       | /       /  \\\   --__ \\       :    e
x  \      \/   _--~~          ~--__| \     |    x  
*   \      \_-~                    ~-_\    |    *
g    \_     \        _.--------.______\|   |    g
o      \     \______// _ ___ _ (_(__>  \   |    o
a       \   .  C ___)  ______ (_(____>  |  /    a
t       /\ |   C ____)/      \ (_____>  |_/     t
s      / /\|   C_____)       |  (___>   /  \    s
e     |   (   _C_____)\______/  // _/ /     \   e
x     |    \  |__   \\_________// (__/       |  x
*    | \    \____)   `----   --'             |  *
g    |  \_          ___\       /_          _/ | g
o   |              /    |     |  \            | o
a   |             |    /       \  \           | a
t   |          / /    |         |  \           |t
s   |         / /      \__/\___/    |          |s
e  |           /        |    |       |         |e
x  |          |         |    |       |         |x
* g o a t s e x * g o a t s e x * g o a t s e x *
