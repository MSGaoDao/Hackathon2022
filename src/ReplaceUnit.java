private string ReplaceUnit(string resultText)
{
	var unitMap = Config.UnitMap.OrderBy(o => o.Key.Length).ToDictionary(o => o.Key, p => p.Value);
	foreach (var unit in unitMap.Keys)
	{
		resultText = resultText.Replace(unit, Config.UnitMap[unit]);
	}
}