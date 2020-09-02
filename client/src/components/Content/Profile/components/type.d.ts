export enum ProfileFieldLabel {
    firstName = 'Имя',
    lastName = 'Фамилия',
    patronimic = 'Отчество',
    crewRole = 'Должность',
    standingFromDate = 'Дата начала работы в компании',
    standingFromDateInRole = 'Дата заступления на текущую должность',
    reliabilityIndex = 'Индекс надежности',
    rewardsAndPunishments = 'Разность между наградами и наказаниями'
}

/**
 * Перечисление ролей
 */
export enum CrewRoleEnum {
    twoP = '2П',
    twoPintern = '2П-стажер',
    manager = 'КВС-инстр',
    kvs = 'КВС',
    kvsExam = 'КВС-экзаменатор',
    kvsIntern = 'КВС-стажер'
}

/**
 * Роли
 */
export type CrewRoleType = CrewRoleEnum.twoP | CrewRoleEnum.twoPintern | CrewRoleEnum.kvs | CrewRoleEnum.kvsExam | CrewRoleEnum.intern | CrewRoleEnum.manager

export type ProfileFieldType = {
    firstName: string, // Имя
    lastName: string, // Фамилия
    patronimic: string, // Отчество
    crewRole: CrewRoleType | string, // должность
    standingFromDate: string, // Дата начала работы в компании
    standingFromDateInRole: string, // Дата заступления на текущую должность
    reliabilityIndex: int, // Индекс надежности
    rewardsAndPunishments: int // Разность между наградами и наказаниями
}