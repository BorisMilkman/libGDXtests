package com.libgdxtests.game;

import com.badlogic.gdx.Game;
import com.libgdxtests.game.Tests.MeshCombiningTest;

public class LibGDXTests extends Game {
	/* TESTS LIST */
	public static MeshCombiningTest meshCombiningTest;
	
	@Override
	public void create () {
		meshCombiningTest = new MeshCombiningTest(this);

		setScreen(meshCombiningTest);
	}

	@Override
	public void render () {

	}
}
