function solution(bandage, health, attacks) {
  const [coolTime, heal, moreHeal] = bandage;
  let energy = health,
    count = 0;
  const lastAttack = attacks[attacks.length - 1];

  for (let i = 1; i <= lastAttack[0]; i++) {
    let time, power;
    if (i === attacks[0][0]) {
      [time, power] = attacks.shift();
      energy -= power;
      count = 0;

      if (energy <= 0) return -1;
    } else {
      energy += heal;
      count++;
      if (count === coolTime) {
        energy += moreHeal;
        count = 0;
      }
      energy = Math.min(energy, health);
    }
  }

  return energy;
}
