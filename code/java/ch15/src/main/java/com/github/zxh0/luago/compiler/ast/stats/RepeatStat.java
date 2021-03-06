package com.github.zxh0.luago.compiler.ast.stats;

import com.github.zxh0.luago.compiler.ast.Block;
import com.github.zxh0.luago.compiler.ast.Exp;
import com.github.zxh0.luago.compiler.ast.Stat;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RepeatStat extends Stat {

    private Block block;
    private Exp exp;

}
